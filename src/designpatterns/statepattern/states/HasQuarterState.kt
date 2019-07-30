package designpatterns.statepattern.states

import designpatterns.statepattern.GumballMachine
import kotlin.random.Random

class HasQuarterState(private val machine: GumballMachine) : GumballMachineState {

    private val randomWinner = Random(System.currentTimeMillis())

    override fun insertQuarter() {
        println("You've already provided a quarter. Ejecting this one...")
    }

    override fun turnCrank() {
        println("Turning the crank...")

        val winner = randomWinner.nextInt(10)

        if (winner == 0) {
            machine.goTo(GumballMachineState.State.WINNER)
        } else {
            machine.goTo(GumballMachineState.State.SOLD)
        }
    }

    override fun ejectQuarter() {
        println("Ejecting the quarter...")
        machine.goTo(GumballMachineState.State.NO_QUARTER)
    }
}