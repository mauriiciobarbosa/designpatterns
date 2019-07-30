package designpatterns.statepattern.states

import designpatterns.statepattern.GumballMachine

class WinnerState(private val machine: GumballMachine) : GumballMachineState {

    override fun insertQuarter() {
        println("We're processing your ball. Please, wait for it.")
    }

    override fun turnCrank() {
        println("We're processing your ball. Please, wait for it.")
    }

    override fun ejectQuarter() {
        println("You cannot eject a quarter after turn the crank.")
    }

    override fun dispenseBall() {
        machine.dispenseBall()

        if (machine.numberOfBalls == 0) {
            machine.goTo(GumballMachineState.State.SOLD_OUT)
        } else {
            println("YOU'RE A WINNER!! You got two gumballs for your quarter")
            machine.dispenseBall()

            if (machine.numberOfBalls > 0) {
                machine.goTo(GumballMachineState.State.NO_QUARTER)
            } else {
                println("Ops, out of gumballs!")
                machine.goTo(GumballMachineState.State.SOLD_OUT)
            }
        }

        machine.print()
    }
}