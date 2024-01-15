plugins {
    id("com.lovelysystems.gradle") version ("1.11.5")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/docker-proftpd") {
        from("docker")
    }
}

