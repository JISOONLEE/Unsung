<https://haerong22.tistory.com/94?category=801599>

<aside>๐ก HDFS์ ์ ์ฅ๋ ํ์ผ์ ์ฝ์ด์ spark ( java)๋ก wordcount ์์ฑ

</aside>

# ํ๋ก ์คํ์ํค๊ธฐ

```
start-dfs.sh

```

# ์คํํฌ ์คํ์ํค๊ธฐ

```
cd spark-3.1.2/bin 
./spark-shell   

cd spark-3.1.2/sbin
./start-master.sh

jsp => master ๋ ๋  ์๋์ง ํ์ธ 

```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ed249c8a-a14d-4520-9640-df52695826e8/Untitled.png)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/5cbb0653-3860-4d00-9c73-79a5c006ba81/Untitled.png)

```
./start-slave.sh  {๋ง์คํฐ ์ฃผ์}

./start-slave.sh spark://ubuntu:7077

#skark_env job 2๊ฐ๋ฅผ ์ค์ ํ ๊ธฐ์ค, worker๊ฐ 2๊ฐ ๋จ๋ฉด ์ฑ๊ณต 

```

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/664a5276-9e61-4779-bbe5-77877983b800/Untitled.png)

# ์ดํด๋ฆฝ์ค๋ก wordcount ์์ฑํ๊ธฐ

## spring MVC Project ์์ฑ

> spring MVC Project๊ฐ ์๋ค๋ฉด

**Help โ Eclipse Marketplace** ์ ํด๋ฆญํ๊ณ  **Find** ์์ **STS** ๋ฅผ ๊ฒ์ํด์ ์ค์น

> 