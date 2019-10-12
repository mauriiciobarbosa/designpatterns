package designpatterns.observer.subjects

import designpatterns.observer.observers.Observer

interface Subject {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}