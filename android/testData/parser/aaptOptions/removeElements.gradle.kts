android {
  aaptOptions {
    additionalParameters("abcd", "efgh")
    cruncherEnabled(true)
    cruncherProcesses(1)
    failOnMissingConfigEntry(false)
    ignoreAssets("efgh")
    noCompress("a")
  }
}
