package models.daos.api

import concurrent.Future

import models.Questao

trait QuestaoDAO extends DAO {
  def add(instancia: Questao): Future[Questao]
  def list: Future[Seq[Questao]]
  def get(id: Int): Future[Option[Questao]]
}
