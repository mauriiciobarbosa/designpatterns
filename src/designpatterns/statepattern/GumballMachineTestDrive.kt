package designpatterns.statepattern

fun main() {
    val machine = GumballMachine(5)
    testHappyPath(machine)
    testInsertTwoQuarters(machine)
    testTurnCrankBeforeInsertQuarter(machine)
    testEjectQuarterBeforeInsertQuarter(machine)
    testSoldOut(GumballMachine(0))
    testWinnerPath(GumballMachine(10))
}

fun testEjectQuarterBeforeInsertQuarter(machine: GumballMachine) {
    machine.ejectQuarter()
    machine.ejectQuarter()
    machine.insertQuarter()
    machine.ejectQuarter()
}

fun testSoldOut(machine: GumballMachine) {
    machine.insertQuarter()
    machine.turnCrank()
    machine.ejectQuarter()
}

fun testTurnCrankBeforeInsertQuarter(machine: GumballMachine) {
    machine.turnCrank()
}

fun testInsertTwoQuarters(machine: GumballMachine) {
    machine.insertQuarter()
    machine.insertQuarter()
    machine.ejectQuarter()
}

fun testHappyPath(machine: GumballMachine) {
    machine.insertQuarter()
    machine.turnCrank()
}

fun testWinnerPath(gumballMachine: GumballMachine) {
    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()

    gumballMachine.insertQuarter()
    gumballMachine.turnCrank()
}