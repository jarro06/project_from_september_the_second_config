 
listView('project_from_september_the_second Jobs') {
    description('project_from_september_the_second Jobs')
    jobs {
        regex('project_from_september_the_second_.+')
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
