package com.fairviewcodeclub.resk.logic

/**
 * A country!
 */
class Node(val index: Int) {

}


class Connection(val a: Int, val b: Int) {

    override fun equals(other: Any?): Boolean {
        return other is Connection &&
                (other.a == this.b && other.b == this.a
                ||
                other.a == this.a && other.b == this.b)
    }

}