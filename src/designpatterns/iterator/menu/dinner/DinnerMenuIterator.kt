package designpatterns.iterator.menu.dinner

import designpatterns.iterator.menu.MenuItem

class DinnerMenuIterator(
    private val items: Array<MenuItem>,
    private val currentSize: () -> Int
) : Iterator<MenuItem> {
    private var actualIndex = 0

    override fun hasNext() = currentSize() > actualIndex

    override fun next() = items[actualIndex++]
}