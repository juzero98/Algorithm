import re

def solution(new_id):
    answer = ''
    
    # 1단계
    new_id = new_id.lower()
    print(new_id)
    
    # 2단계
    # re.sub(정규표현식, replacement, 문자열)
    new_id = re.sub('[^a-z0-9-_.]', '', new_id)
    print(new_id)
    
    # 3단계
    # .은 이스케이프 처리
    new_id = re.sub('\.+', '.', new_id)
    print(new_id)
    
    # 4단계
    new_id = re.sub('^\.', '', new_id)
    new_id = re.sub('\.$', '', new_id)
    print(new_id)
    
    # 5단계
    if new_id == '' :
        new_id = 'a'
    print(new_id)
    
    # 6단계
    if len(new_id) > 15 :
        new_id = new_id[0:15]
        if new_id[14] == '.' :
            new_id = new_id[0:14]
    print(new_id)
    
    # 7단계
    length = len(new_id)
    if length < 3 :
        new_id = new_id + (new_id[length-1] * (3-length))
    print(new_id)
    
    return new_id