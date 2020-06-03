"""
Item Fetcher Class Inorder to fetch items as pandas dataframe
"""
import django
from django.conf import settings
import os
import pandas as pd

# setting up django settings in order to use it's components standalone
if not settings.configured:
    os.environ.setdefault('DJANGO_SETTINGS_MODULE', 'AACT.settings')
    django.setup()

from exporter.models import *


def first_posted_date(start, end):
    """ 
    Retrive trials by first posted date between start and end date and filter out unrelevant records 
    start : Start of the date range (YYYY-MM-DD)
    end :   End of the date range (YYYY-MM-DD)
    """
    l = Studies.objects.filter(study_first_posted_date__range=(start, end)).values()
    df = pd.DataFrame(l)
    return df


def start_date(start, end):
    """ 
    Retrive trials by start date between start and end date and filter out unrelevant records 
    start : Start of the date range (YYYY-MM-DD)
    end :   End of the date range (YYYY-MM-DD)
    """
    l = Studies.objects.filter(start_date__range=(start, end)).values()
    df = pd.DataFrame(l)
    return df
