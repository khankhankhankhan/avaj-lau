find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
java com.weather.Simulator com/scenario.txt
