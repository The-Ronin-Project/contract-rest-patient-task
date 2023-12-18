group = "com.projectronin.rest.contract"

plugins {
    alias(roningradle.plugins.openapi.contract)
}

restContractSupport {
    generatorType.set(com.projectronin.rest.contract.GeneratorType.OPENAPI_GENERATOR)
}

tasks.generateOpenApiCodeOpenApiGenerator {
    configOptions.set(
        mapOf(
            "useTags" to "true"
        )
    )
}
