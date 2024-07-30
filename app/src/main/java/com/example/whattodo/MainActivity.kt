package com.example.whattodo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whattodo.ui.theme.WhatToDoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatToDoTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        HomeScreen()
                    }
                }
            }
        }
    }
}


@Preview
@Composable
fun HomeScreen(){
    Column {
        Spacer(modifier = Modifier.height(50.dp))
        val navController = rememberNavController()
        NavHost(navController, startDestination = "home" ){
            composable("home"){ Choice(navController)}
            composable("happy") { Celebrate() }
            composable("sad"){ Sad()}
            composable("angry"){ Angry()}
            composable("nervous"){Nervous()}
            composable("guilty"){ Guilty()}
            composable("curious"){ Curious()}
        }
    }
}


@Composable
fun Choice(navController: NavController){
    val happy= painterResource(id = R.drawable.happy)
    val sad= painterResource(id = R.drawable.sad)
    val angry= painterResource(id = R.drawable.angry)
    val nervous= painterResource(id = R.drawable.nervous)
    val guilty= painterResource(id = R.drawable.guilty)
    val curious= painterResource(id = R.drawable.curious)
    Column(modifier= Modifier
        .fillMaxSize()
        .padding(horizontal = 10.dp)) {
        Text(
            text = "What's your mood today?",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp,
            lineHeight = 50.sp
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("happy") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = happy,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Happy :)",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("sad") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = sad,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Sad :(",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("angry") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = angry,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Angry  :@",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("nervous") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = nervous,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Nervous :-/",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("guilty") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = guilty,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Guilty :-[",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
            Column(
                modifier = Modifier
                    .width(155.dp)
                    .height(115.dp)
                    .background(
                        color = Color.Transparent,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .shadow(4.dp, shape = RoundedCornerShape(8.dp))
                    .background(Color.White)
                    .clickable { navController.navigate("curious") },
                horizontalAlignment = Alignment.CenterHorizontally

            ){
                Image(
                    painter = curious,
                    contentDescription = null,
                    modifier = Modifier.size(50.dp)
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "Curious :-?",
                    color = Color.Black,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 50.sp
                )
            }
        }
    }
}

@Composable
fun Celebrate(){
    val happyPage= painterResource(id = R.drawable.happypage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = happyPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "When you're is happy, engaging in regular physical activity, eating a balanced diet, staying connected with loved ones, practicing mindfulness, getting enough sleep, pursuing hobbies, volunteering, and setting personal goals can all support continued happiness and overall health.",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }
}

@Composable
fun Sad(){
    val sadPage= painterResource(id = R.drawable.sadpage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = sadPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "When you're feeling sad, consider engaging in activities that lift your mood, such as talking to friends or family for support, practicing self-care with activities you enjoy, maintaining a healthy diet, getting regular exercise, and ensuring adequate sleep. It can also be helpful to express your feelings through journaling or creative outlets and seek professional support if sadness persists or impacts your daily life.",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }
}

@Composable
fun Angry(){
    val angryPage= painterResource(id = R.drawable.angrypage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = angryPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "When you're feeling angry, try to calm yourself by taking deep breaths and practicing mindfulness or meditation. Engage in physical activities like exercise to release built-up tension. Take a timeout to give yourself space to cool down, and consider expressing your feelings through writing or talking to someone you trust.",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }

}

@Composable
fun Nervous(){
    val nervousPage= painterResource(id = R.drawable.nervouspage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = nervousPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "When you're feeling nervous, try calming techniques such as deep breathing exercises or practicing mindfulness to center yourself. Engage in physical activity to release tension and boost your mood. Prepare and plan for the situation causing your nerves, which can help build confidence. Talk to a friend or family member for support and reassurance. ",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }

}

@Composable
fun Guilty(){
    val guiltyPage= painterResource(id = R.drawable.guiltypage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = guiltyPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text = "When you're feeling guilty, it's important to acknowledge your feelings and understand the reason behind them. Reflect on the situation and take responsibility if necessary. Apologize to anyone you may have hurt and make amends if possible. Practice self-forgiveness and remind yourself that everyone makes mistakes. Engage in positive activities that can help you feel better about yourself, and seek support from friends, family, or a professional if the feelings of guilt persist.",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }
}

@Composable
fun Curious(){
    val curiousPage= painterResource(id = R.drawable.curiouspage)
    Column(
        modifier= Modifier
            .fillMaxSize()
            .padding(horizontal = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = curiousPage,
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(
            text="When you're feeling curious, embrace your curiosity by exploring new topics and learning something new. Read books, articles, or watch documentaries that interest you. Ask questions and engage in discussions with others to gain different perspectives. Experiment with hands-on activities or hobbies that spark your interest.",
            color = Color.Black,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            lineHeight = 50.sp
        )
    }
}