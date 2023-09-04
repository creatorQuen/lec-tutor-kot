package lec3

class initer {
}

interface HandleError {
    fun handle(error: String)
}

interface ViewModel {

    fun init()

    class Base(
        private val repository: Repository,
        private val handleError: HandleError
    ) : ViewModel {

        private val handleResult = object : HandleResult {
            override fun handleSuccess(x: Int) {
                //liveData.postValue(x)
            }

            override fun handleError(message: String) {
                handleError.handle(message)
            }
        }

        override fun init() {
            // that cool
            repository.data().handle(handleResult)

            // that dich----------------------------
//            val data = repository.data()
//
//            when(data) {
//                is Result.Success ->
//            }
            //dich----------------------------
        }

//        override fun init() {
//            repository.data().handle(object : HandleResult {
//                override fun handleSuccess(x: Int) {
//                    //liveData.postValue(x)
//                }
//
//                override fun handleError(message: String) {
//                    handleError.handle(message)
//                }
//
//            })
//        }
    }
}

interface Repository {

    fun data(): Result

    class Base: Repository {

        override fun data(): Result {
            return if (System.currentTimeMillis() > 1000000)
                Result.Success(1000000)
            else
                Result.Error("error")
        }
    }
}

sealed class Result {
    abstract fun handle(handleResult: HandleResult)

    class Success(private val value: Int): Result() {
        override fun handle(handleResult: HandleResult) {
            handleResult.handleSuccess(value)
        }
    }

    class Error(private val message: String): Result() {
        override fun handle(handleResult: HandleResult) {
            handleResult.handleError(message)
        }
    }

}

interface HandleResult {
    fun handleSuccess(x: Int)
    fun handleError(message: String)
}