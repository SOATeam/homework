import requests
from lxml import etree

html = requests.get("http://www.163.com");
selector = etree.HTML(html.text);
content = selector.xpath("//*[@id='js_index2017_wrap']/div[2]/div[2]/div[4]/div[1]/div[2]/div/div/div/div[1]/div[1]/div[2]/ul[1]/li[1]/a/text()");
for each in content:
    print each;