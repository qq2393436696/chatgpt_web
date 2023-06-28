mvn clean package
if [ ! -d "/data/java/chatgpt_web" ]; then
    mkdir /data/java/chatgpt_web
fi
mv /data/dev/chatgpt_web/chatgpt-bootstrap/target/chatgpt-bootstrap-1.0.2.jar /data/java/chatgpt_web/chatgpt-bootstrap-1.0.2.jar


