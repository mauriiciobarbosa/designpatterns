package designpatterns.statepattern

fun main() {
    val machine = GumballMachine(5)
    testHappyPath(machine)
    testInsertTwoQuarters(machine)
    testTurnCrankBeforeInsertQuarter(machine)
    testEjectQuarterBeforeInsertQuarter(machine)
    testSoldOut(GumballMachine(0))
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
