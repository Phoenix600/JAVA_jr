public class TestClass
{
    public static void main(String[] args)
    {
        System.out.println("Peeepp");
    } 
}



// Steps to set the environment variables into your system 
/* #TODO:
    [X] Install the java using cmd 
    [X] Find where JAVA is installed 
    [X] Set up the environment variables is set or not
    [X] Reload the /etc/environment file 
    [X] Setup the alias of java as jr in /.bashrc file 

    [O] Commands : 
    ==============
        1. sudo apt-get install java-18-headless
        2. javac --version
        3. update-alternatives --config java
        4. java --version
        5. echo $JAVA_HOME  // If not configured set the environemnt variable
        6. geddit /etc/environemnt 
           JAVA_HOME="/usr/lib/jvm/java-18-openjdk-amd64/bin/java"
        7. source /etc/environment 
*/