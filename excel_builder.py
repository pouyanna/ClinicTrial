import item_fetcher
import pandas as pd
import xlsxwriter


def first_posted_date(start, end):
    s = item_fetcher.first_posted_date(start, end)
    df = pd.DataFrame(list(s))


first_posted_date('2019-02-12', '2019-10-30')