package com.sfodreamz.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Component
import org.springframework.stereotype.Repository
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext
import javax.persistence.criteria.CriteriaBuilder
import javax.persistence.criteria.Root
import sun.misc.MessageUtils.where
import javax.persistence.criteria.ParameterExpression

interface UserDAO:CrudRepository<User, Long> {

    /*fun findByEmail(email: String): User {
        val criteriaBuilder = entityManager!!.getCriteriaBuilder().apply {
            parameter(String::class.java)
        }

        val q = criteriaBuilder.createQuery(User::class.java)
        val c = q.from(User::class.java)

        q.select(c).where(criteriaBuilder.gt(c.get("population"), p))
    }*/
}