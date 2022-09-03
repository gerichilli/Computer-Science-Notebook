prefixes = 'JKLMNOPQ'
suffix = ['ack'] * len(prefixes)
remixes = zip(prefixes, suffix)
for remix in remixes:
    print('zipped version:', remix)