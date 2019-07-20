package designpatterns.statepattern.states

interface GumballMachineState {
    fun insertQuarter()
    fun turnCrank()
    fun ejectQuarter()
    fun dispenseBall() {
        // You can only dispense a ball in the sold state
    }

    enum class State {
        NO_QUARTER, HAS_QUARTER, SOLD, SOLD_OUT
    }
}