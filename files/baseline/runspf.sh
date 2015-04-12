#!/bin/sh
java -Djava.library.path=/home/draikes/workspace/jpf-symbc/lib -jar /home/draikes/workspace/jpf-core/build/RunJPF.jar /home/draikes/workspace/DiningPhil.jpf 4 > runspf.log 2>&1
