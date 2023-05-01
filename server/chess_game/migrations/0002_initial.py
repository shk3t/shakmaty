# Generated by Django 4.1.3 on 2023-01-21 10:53

from django.conf import settings
from django.db import migrations, models
import django.db.models.deletion
import django.utils.timezone


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ("user_app", "0001_initial"),
        ("chess_game", "0001_initial"),
    ]

    operations = [
        migrations.CreateModel(
            name="Player",
            fields=[
                (
                    "id",
                    models.OneToOneField(
                        db_column="id",
                        on_delete=django.db.models.deletion.CASCADE,
                        primary_key=True,
                        related_name="player",
                        serialize=False,
                        to=settings.AUTH_USER_MODEL,
                    ),
                ),
                ("rating", models.IntegerField(default=2000)),
                ("country", models.CharField(default="FIDE", max_length=50)),
            ],
        ),
        migrations.CreateModel(
            name="ReadyToPlay",
            fields=[
                (
                    "player",
                    models.OneToOneField(
                        db_column="id",
                        on_delete=django.db.models.deletion.CASCADE,
                        primary_key=True,
                        related_name="player",
                        serialize=False,
                        to="chess_game.player",
                    ),
                ),
                (
                    "chosen_time_mode",
                    models.CharField(default="00:03:00|2", max_length=20),
                ),
                ("wait_start", models.DateTimeField(default=django.utils.timezone.now)),
            ],
        ),
        migrations.AddField(
            model_name="chessgame",
            name="black_player",
            field=models.ForeignKey(
                on_delete=django.db.models.deletion.CASCADE,
                related_name="black_player",
                to="chess_game.player",
            ),
        ),
        migrations.AddField(
            model_name="chessgame",
            name="white_player",
            field=models.ForeignKey(
                on_delete=django.db.models.deletion.CASCADE,
                related_name="white_player",
                to="chess_game.player",
            ),
        ),
    ]
