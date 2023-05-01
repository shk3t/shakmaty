# Generated by Django 4.1.3 on 2023-01-21 10:53

import django.core.validators
from django.db import migrations, models
import user_app.models
import user_app.validators


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ("auth", "0012_alter_user_first_name_max_length"),
    ]

    operations = [
        migrations.CreateModel(
            name="User",
            fields=[
                (
                    "id",
                    models.BigAutoField(
                        auto_created=True,
                        primary_key=True,
                        serialize=False,
                        verbose_name="ID",
                    ),
                ),
                (
                    "is_superuser",
                    models.BooleanField(
                        default=False,
                        help_text="Designates that this user has all permissions without explicitly assigning them.",
                        verbose_name="superuser status",
                    ),
                ),
                (
                    "is_staff",
                    models.BooleanField(
                        default=False,
                        help_text="Designates whether the user can log into this admin site.",
                        verbose_name="staff status",
                    ),
                ),
                ("nickname", models.CharField(max_length=128, verbose_name="nickname")),
                (
                    "email",
                    models.EmailField(
                        max_length=254, unique=True, verbose_name="email address"
                    ),
                ),
                (
                    "password",
                    models.CharField(
                        blank=True,
                        max_length=128,
                        null=True,
                        validators=[user_app.validators.password_validator],
                        verbose_name="password",
                    ),
                ),
                (
                    "picture",
                    models.ImageField(
                        blank=True,
                        null=True,
                        upload_to="users",
                        validators=[
                            django.core.validators.validate_image_file_extension
                        ],
                    ),
                ),
                ("age", models.IntegerField(blank=True, null=True)),
                (
                    "account_provider",
                    models.CharField(
                        choices=[("google", "Google")], max_length=128, null=True
                    ),
                ),
                ("account_subject", models.CharField(max_length=128, null=True)),
                (
                    "groups",
                    models.ManyToManyField(
                        blank=True,
                        help_text="The groups this user belongs to. A user will get all permissions granted to each of their groups.",
                        related_name="user_set",
                        related_query_name="user",
                        to="auth.group",
                        verbose_name="groups",
                    ),
                ),
                (
                    "user_permissions",
                    models.ManyToManyField(
                        blank=True,
                        help_text="Specific permissions for this user.",
                        related_name="user_set",
                        related_query_name="user",
                        to="auth.permission",
                        verbose_name="user permissions",
                    ),
                ),
            ],
            options={
                "ordering": ["id"],
            },
            bases=(models.Model, user_app.models.SafeModelMixin),
        ),
    ]
