package com.gristerm.app.repository

import com.gristerm.app.domain.UserModel
import java.util.*
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : MongoRepository<UserModel, String> {
  fun findByEmail(email: String): Optional<UserModel>

  fun findByUsername(username: String): Optional<UserModel>
}
