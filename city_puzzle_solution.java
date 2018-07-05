# Solution to:
# ['Tokyo', 'London', 'Rome', 'Donlon', 'Kyoto', 'Paris']
# // YOUR ALGORITHM
# [
#     [ 'Tokyo', 'Kyoto' ],
#     [ 'London', 'Donlon' ],
#     [ 'Rome' ],
#     [ 'Paris' ]
# ]

def get_hash(value):
    return ''.join(sorted(value.lower()))

def main(cities):
    result = {} 
    for city in cities:
        city_hash = get_hash(city)
        if result.get(city_hash) is not None:
            result[city_hash].append(city)
        else:
            result[city_hash] = [city]
            
    return result
    
if __name__ == '__main__':
    input = (('Tokyo', 'London', 'Rome', 'Donlon', 'Kyoto', 'Paris'))
    
    answer = main(input)
    print answer
