from pip._vendor.html5lib._ihatexml import digit
"""
def addDigits(aString):
    if len(aString) == 0:
        return 0
    else:
        if aString[0] not in '0123456789':
            return addDigits(aString[1:])
        else:
            return int(aString[0]) + addDigits(aString[1:])
        
print(addDigits('myname2is6joe12black0'))

def removeElement(aList,element):
    if len(aList) == 0:
        return []
    else:
        if aList[0] == element:
            return removeElement(aList[1:],element)
        else:
            return [aList[0]] + removeElement(aList[1:],element)
print(removeElement(['e','s','s','g',''],'s'))"""
    
"""
def reverseAndFlipCase(aString):
    if len(aString)==0:
        return ''
    else:
        if aString[len(aString)-1] in '0123456789':
            return aString[len(aString)-1] + reverseAndFlipCase(aString[0:len(aString)-1])
        elif aString[len(aString)-1] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
            return aString[len(aString)-1].lower() + reverseAndFlipCase(aString[0:len(aString)-1])
        else:
            return aString[len(aString)-1].upper() + reverseAndFlipCase(aString[0:len(aString)-1])
        
print(reverseAndFlipCase('AjfKleAjn123'))"""
    
"""def removeDigi(number,digit):
    if len(str(number)) == 0:
        return ''
    else:
        if str(number)[0] != str(digit):
            return str(number)[0] + removeDigi(str(number)[1:],digit)
        else:
            return removeDigi(str(number)[1:],digit)


def removeDigit(number,digit):
    x=removeDigi(number,digit)
    newX = int(x)
    return newX
print(removeDigit(9745,4))"""

class Line:
    def __init__(self,slope,intercept):
        self.slope = slope
        self.intercept = intercept
    def get(self):
        return self.slope,self.intercept
    def __str__(self):
        return 'y = {}x + {}'.format(self.slope,self.intercept)