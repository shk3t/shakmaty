import axios from "axios"
import {logout, refreshTokens} from "./reducers/authReducer"
import {BASE_URL} from "./consts/base"

let store

export function injectStore(_store) {
  store = _store
}

export const publicConfig = axios.create({
  baseURL: BASE_URL,
})

export const authNoRefreshConfig = axios.create({
  baseURL: BASE_URL,
  withCredentials: true,
})

export const authConfig = axios.create({
  baseURL: BASE_URL,
  withCredentials: true,
})

authConfig.interceptors.request.use((config) => {
  const accessToken = store.getState().authReducer.accessToken
  config.headers.Authorization = `Bearer ${accessToken}`
  return config
})

authConfig.interceptors.response.use(
  (config) => config,
  async (error) => {
    const originalRequest = error.config
    if (
      error.response.status === 401 &&
      originalRequest &&
      !originalRequest._is_retry
    ) {
      originalRequest._is_retry = true
      try {
        await store.dispatch(refreshTokens())
        return authConfig.request(originalRequest)
      } catch (exception) {
        store.dispatch(logout())
      }
    } else {
      throw error
    }
  }
)