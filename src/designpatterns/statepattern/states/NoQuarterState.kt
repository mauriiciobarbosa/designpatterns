package designpatterns.statepattern.states

import designpatterns.statepattern.GumballMachine

class NoQuarterState(private val machine: GumballMachine) : GumballMachineState {

    override fun insertQuarter() {
        println("Quarter inserted")
        machine.goTo(GumballMachineState.State.HAS_QUARTER)
    }

    override fun turnCrank() {
        println("You can't turn the crank without a quarter inserted")
    }

    override fun ejectQuarter() {
        println("You can't eject the quarter without provide one")
    }
}