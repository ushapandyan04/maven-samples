def (CheckoutSCM) {
    echo "checkout code from SCM"
    sh checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '73b8bce4-d85a-44f6-984b-8c0b0403590e', url: 'https://github.com/sushmabn/maven-samples.git']]])

}