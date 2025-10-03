plugins {
    id("com.lovelysystems.gradle") version ("1.12.0")
}

lovely {
    gitProject()
    dockerProject("ghcr.io/lovelysystems/docker-proftpd") {
        from("docker")
    }
}

