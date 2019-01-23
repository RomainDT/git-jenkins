node{
	stage('Hello'){
		echo "Hello Bitches"
	}
	stage ('env variable'){
		echo "affiche toutes les variables dispo"
		sh 'env';
	}
}
