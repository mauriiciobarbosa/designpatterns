package designpatterns.statepattern.states

import designpatterns.statepattern.GumballMachine

class SoldOutState(private val machine: GumballMachine) : GumballMachineState {

    override fun insertQuarter() {
        println("We've no balls, sorry. Ejecting the quarter...")
    }

    override fun turnCrank() {
        println("You can't turn the crank without provide a quarter. Furthermore, we've no balls.")
    }

    override fun ejectQuarter() {
        println("You can't eject a quarter without provide one. Furthermore, we've no balls.")
    }
}