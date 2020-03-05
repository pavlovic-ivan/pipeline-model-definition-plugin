# Declarative Jenkins Pipelines (Pipeline Model Definition Plugin)

[![Jenkins Plugin](https://img.shields.io/jenkins/plugin/v/pipeline-model-definition)](https://plugins.jenkins.io/pipeline-model-definition)
[![Changelog](https://img.shields.io/github/v/tag/jenkinsci/pipeline-model-definition-plugin?label=changelog)](https://github.com/jenkinsci/pipeline-model-definition-plugin/blob/master/CHANGELOG.md)
[![Jenkins Plugin Installs](https://img.shields.io/jenkins/plugin/i/pipeline-model-definition?color=blue)](https://plugins.jenkins.io/pipeline-model-definition)
[![Contributors](https://img.shields.io/github/contributors/jenkinsci/pipeline-model-definition-plugin.svg)](https://github.com/jenkinsci/pipeline-model-definition-plugin/contributors)

The Pipeline Model Definition Plugin provides a config-like syntax for defining Pipelines - thus Declarative Pipeline.

This plugin requires Jenkins 2.121.1 or later

**WARNING**:
Older versions of this plugin may not be safe to use. Please review the
following warnings before using an older version:

-   [Script Security sandbox
    bypass](https://jenkins.io/security/advisory/2019-01-08/#SECURITY-1266)

## Documentation

* [User guide and syntax reference](https://jenkins.io/doc/book/pipeline/)
* [Changelog](https://github.com/jenkinsci/pipeline-model-definition-plugin/blob/master/CHANGELOG.md)
* [Developer Guide](https://github.com/jenkinsci/pipeline-model-definition-plugin/blob/master/DEV_GUIDE.md)
* [Instructions for extending this plugin](https://github.com/jenkinsci/pipeline-model-definition-plugin/blob/master/EXTENDING.md)

## Developing
- To start developing plugin: 
- Clone the plugin repository

`cd pipeline-model-definition && mvn install && mvn hpi:run`

### API extension
For functionality extending, and the API information, consult [EXTENDING.md](EXTENDING.md)

## License

[MIT License](https://opensource.org/licenses/mit-license.php)




