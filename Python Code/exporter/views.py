from django.shortcuts import render
from django.http import HttpResponse
from .models import Studies

# Create your views here.
def index(request):
    s = Studies.objects.all()
    return HttpResponse(s)