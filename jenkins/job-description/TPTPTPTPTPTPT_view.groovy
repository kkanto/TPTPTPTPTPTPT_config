 
listView('TPTPTPTPTPTPT Jobs') {
    description('TPTPTPTPTPTPT Jobs')
    jobs {
        regex('TPTPTPTPTPTPT_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
