package com.shiver.common

interface UseCase<In, Out> {
    fun execute(input: In): Out
}