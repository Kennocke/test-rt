package ru.svitkovskiy

class MainGroovy {
    static def countElements(List list) {
        return list == null ? [:] : list.countBy {it}
    }
}
