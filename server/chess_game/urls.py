from django.urls import path
from chess_game import views

urlpatterns = [
    path('init_game', views.init_game, name='init_game'),
    path('make_move', views.make_move, name='make_move'),
    path('get_rating', views.get_rating, name='make_rating'),
    path('get_last_games', views.get_last_games, name='last_games'),
    path("get_game/<str:ready_player_id>/", views.get_game, name="chat"),
]
