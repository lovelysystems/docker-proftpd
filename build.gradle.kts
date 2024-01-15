plugins {
    id("com.lovelysystems.gradle") version ("1.12.0")
}

lovely {
    gitProject()
    dockerProject("lovelysystems/docker-proftpd") {
        from("docker")
    }
}

