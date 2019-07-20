package designpatterns.statepattern.states

import designpatterns.statepattern.GumballMachine

class HasQuarterState(private val machine: GumballMachine) : GumballMachineState {

    override fun insertQuarter() {
        println("You've already provided a quarter. Ejecting this one...")
    }

    override fun turnCrank() {
        println("Turning the crank...")
        machine.goTo(GumballMachineState.State.SOLD)
    }

    override fun ejectQuarter() {
        println("Ejecting the quarter...")
        machine.goTo(GumballMachineState.State.NO_QUARTER)
    }
}