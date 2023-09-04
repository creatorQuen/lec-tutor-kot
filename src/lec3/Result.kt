package lec3

sealed class ResultMy {
    class Success(val data: Int) : ResultMy()
    class Error(val message: String): ResultMy()
}

interface RepositoryMy {
    fun getData(): ResultMy
}

