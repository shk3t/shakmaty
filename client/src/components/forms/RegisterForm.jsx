import React, {useState} from "react"
import authClasses from "../../styles/pages/AuthPage.module.css"
import registerClasses from "../../styles/forms/RegisterForm.module.css"
import pawnImage from "../../assets/chessFigures/pawn_black.png"
import knightImage from "../../assets/chessFigures/knight_black.png"
import queenImage from "../../assets/chessFigures/queen_black.png"
import kingImage from "../../assets/chessFigures/king_black.png"
import {register} from "../../reducers/authReducer"
import {useDispatch} from "react-redux"
import {makeRequest, setError} from "../../reducers/requestReducer"
import GenericInput from "../inputs/GenericInput"

export default function RegisterForm({toggleAuth}) {
  const dispatch = useDispatch()
  const [credentials, setCredentials] = useState({
    nickname: "",
    email: "",
    password: "",
    passwordConfirmation: "",
  })

  function doRegister() {
    if (credentials.password === credentials.passwordConfirmation) {
      dispatch(makeRequest(() => register(credentials)))
    } else {
      dispatch(setError("Passwords do not match"))
    }
  }

  return (
    <div className={authClasses.registerFormContainer}>
      <h1 className={authClasses.formTitle}>Присоединяйся</h1>
      <h2 className={authClasses.formTitle}>И начинай играть в шахматы!</h2>
      <div className={authClasses.formFields}>
        {[
          {field: "nickname"},
          {field: "email"},
          {field: "password", type: "password"},
          {field: "passwordConfirmation", type: "password"},
        ].map(({field, type}) => (
          <div key={field} className={authClasses.formField}>
            <GenericInput
              {...{field, type, data: credentials, setData: setCredentials}}
            />
          </div>
        ))}
      </div>
      <h2 className={authClasses.question}>Для всех уровней!</h2>
      <div className={registerClasses.icon}>
        {[pawnImage, knightImage, kingImage, queenImage].map((image, index) => (
          <div key={index} className={registerClasses.level}>
            <img src={image} alt="" />
          </div>
        ))}
      </div>
      <div className={`${registerClasses.icon} ${registerClasses.iconWords}`}>
        {["Новичок", "Начальный", "Средний", "PRO"].map((word, index) => (
          <div className={registerClasses.words} key={index}>
            {word}
          </div>
        ))}
      </div>
      <button
        className={authClasses.button}
        id="register"
        style={{width: "202px"}}
        onClick={doRegister}
      >
        Зарегистрироваться
      </button>
      <div className={authClasses.divider}>или</div>
      <div className="googleSignIn"></div>
      <h2 className={authClasses.question}>
        <p className={authClasses.createOne}>Уже есть аккаунт?</p>
      </h2>
      <button className={authClasses.enterButton} onClick={toggleAuth}>
        Войти
      </button>
    </div>
  )
}