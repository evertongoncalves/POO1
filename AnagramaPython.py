from unittest import TestCase

def anagrama(a, b):
    return True if a.replace(' ', '').lower() == b[::-1].replace(' ', '').lower() else False

class SomaTest(TestCase):
    def test_anagrama(self):
        self.assertTrue(anagrama('', ''))
        self.assertTrue(anagrama(' ', ''))
        self.assertTrue(anagrama('a', 'a'))
        self.assertTrue(anagrama('a', 'a '))
        self.assertFalse(anagrama('ab', 'ab'))
        self.assertTrue(anagrama('a', ' a      '))
        self.assertTrue(anagrama('b a','a b'))
        self.assertTrue(anagrama('ba','ab'))
        self.assertTrue(anagrama('Teste', 'etset'))
        self.assertFalse(anagrama('ba', 'a'))
        self.assertTrue(anagrama('b  a', 'ab'))
        self.assertFalse(anagrama('python', 'nohtypi'))

a = SomaTest()
a.test_anagrama()
