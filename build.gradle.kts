plugins {
    id("com.lovelysystems.gradle") version ("1.1.0")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/docker-proftpd")
    with(dockerFiles) {
        from("docker") 
    }
}

