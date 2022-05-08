package com.example.a210109_ex_retrofit_stickode.delegateSample1

fun getPostListFromServer(id: Int): List<Post> {
    println("get big data from server")
    return listOf(Post())
}

class Post

class Board(val id: Int) {
    private lateinit var _list: List<Post>
    val list: List<Post>
        get() =
            //객체가 생성되지 않은 경우
            if (!::_list.isInitialized) {
                println("lazy init")
                //리스트 객체 반환
                this._list = getPostListFromServer(this.id)
                //리스트 객체 입력
                this._list
            } else {
                println("already init")
                this._list
            }
}

fun main() {
    val board = Board(1)
    println("lazy init board list :: ${board.list}") // lazy init board list :: [Post@a09ee92]
    println("board list :: ${board.list}") // board list :: [Post@a09ee92]
}

// 실행 결과
// lazy init
// get big data from server
// lazy init board list :: [Post@a09ee92]
// already init
// board list :: [Post@a09ee92]

/*
*
 fun getPostListFromServer(id: Int): List<Post> {
    println("get big data from server")
    return listOf(Post())
}

class Post

class Board(val id: Int) {
    //실제로는 Lazy 객체에서 List를 생성해주는 작업을 위임하여 진행
    val list: List<Post> by lazy { getPostListFromServer(this.id) }
}

fun main() {
    val board = Board(1)
    println("lazy init board list :: ${board.list}") // lazy init board list :: [Post@a09ee92]
    println("board list :: ${board.list}") // board list :: [Post@a09ee92]
}

*  */
