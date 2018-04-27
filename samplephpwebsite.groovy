job('samplephpwebsite-v1') {
    description 'samplephpwebsite-v1'
    scm {
        git {
            remote {
                name('origin')
                url('https://gitlab.com/alexandre.morat/eval-project.git')
            }
            branch('v1')
            }
    }
    triggers{
        scm('H/15 * * * *')
    }
    steps{
        dockerBuildAndPublish {
            repositoryName('overpower/nginx-php-fpm:1.0')
            registryCredentials('f5070d99-5cee-407a-9b83-26f784cac0ec')
			buildContext('nginx-php-fpm')
            forcePull(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}

job('samplephpwebsite-v2') {
    description 'samplephpwebsite-v2'
    scm {
        git {
            remote {
                name('origin')
                url('https://gitlab.com/alexandre.morat/eval-project.git')
            }
            branch('v2')
            }
    }
    triggers{
        scm('H/15 * * * *')
    }
    steps{
        dockerBuildAndPublish {
            repositoryName('overpower/nginx-php-fpm:2.0')
            registryCredentials('f5070d99-5cee-407a-9b83-26f784cac0ec')
			buildContext('nginx-php-fpm')
            forcePull(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}

job('samplephpwebsite-v3') {
    description 'samplephpwebsite-v3'
    scm {
        git {
            remote {
                name('origin')
                url('https://gitlab.com/alexandre.morat/eval-project.git')
            }
            branch('v3')
            }
    }
    triggers{
        scm('H/15 * * * *')
    }
    steps{
        dockerBuildAndPublish {
            repositoryName('overpower/nginx-php-fpm:3.0')
            registryCredentials('f5070d99-5cee-407a-9b83-26f784cac0ec')
			buildContext('nginx-php-fpm')
            forcePull(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}
