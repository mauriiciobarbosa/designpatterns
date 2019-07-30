package designpatterns.statepattern

import designpatterns.statepattern.states.*

class GumballMachine(inventory: Int) {

    var numberOfBalls: Int = inventory
        private set

    private val allStates = mapOf(
        GumballMachineState.State.NO_QUARTER to NoQuarterState(this),
        GumballMachineState.State.HAS_QUARTER to HasQuarterState(this),
        GumballMachineState.State.SOLD to SoldState(this),
        GumballMachineState.State.SOLD_OUT to SoldOutState(this),
        GumballMachineState.State.WINNER to WinnerState(this)
    )
    private var currentState: GumballMachineState

    init {
        val initState = if (inventory > 0) {
            GumballMachineState.State.NO_QUARTER
        } else {
            GumballMachineState.State.SOLD_OUT
        }
        currentState =
            allStates[initState] ?: throw IllegalStateException("All states map has not ${initState.name} state")

        print()
    }

    fun print() {
        println("------------------------------")
        println("-- Gumball machine v1.0.0   --")
        println("-- Made by Mauricio Barbosa --")
        println("-- Inventory: $numberOfBalls balls       --")
        println("------------------------------")
    }

    fun insertQuarter() {
        currentState.insertQuarter()
    }

    fun turnCrank() {
        currentState.turnCrank()
        currentState.dispenseBall()
    }

    fun ejectQuarter() {
        currentState.ejectQuarter()
    }

    fun dispenseBall() {
        println("Ball rolling out...")
        numberOfBalls -= 1
    }

    fun goTo(state: GumballMachineState.State) {
        currentState = allStates[state] ?: throw IllegalStateException("All states map has not ${state.name} state")
    }

}