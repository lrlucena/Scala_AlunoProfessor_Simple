package models.daos.api

import java.util.UUID

import concurrent.Future

import com.mohiva.play.silhouette.api.LoginInfo

import models.Usuario

trait UsuarioDAO extends DAO {
  def find(loginInfo: LoginInfo): Future[Option[Usuario]]
  def find(id: UUID): Future[Option[Usuario]]
  def save(usuario: Usuario): Future[Usuario]
}
