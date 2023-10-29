package com.example.instauireplica

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instauireplica.ui.theme.InstaUIReplicaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstaUIReplicaTheme {
                InstagramHomeScreen()
            }
        }
    }
}

@Composable
fun InstagramHomeScreen() {
    val sampleData = CardSample().generateSampleData()
    Scaffold(
        bottomBar = { InstagramNavigationBar() }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            LazyColumn() {
                item {
                    InstagramHeader()
                    InstagramStory()

                    sampleData.forEach { cardData ->
                        CardUI().InstagramFeed(cardData)
                    }
                }
            }
        }

    }
}


@Composable
fun InstagramHeader() {
    // ヘッダー部分のUIの実装
    TopAppBar(
        backgroundColor = Color.White,
        title = {
            Icon(
                painter = painterResource(id = R.drawable.aiai),
                contentDescription = "Instagram Text Icon",
                tint = Color.Unspecified,
                modifier = Modifier.size(120.dp)
            )
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.images),
                    contentDescription = "Instagram Heat Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(50.dp)
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.dm),
                    contentDescription = "Instagram Heat Icon",
                    tint = Color.Unspecified,
                    modifier = Modifier.size(50.dp)

                )
            }
        },
        elevation = 0.dp,
    )
}

@Composable
fun InstagramStory() {

    var imageResourceIds = List(10) {
        R.drawable.eeh
    }

    LazyRow(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 4.dp),
    ) {
        items(imageResourceIds) { item ->
            Box(
                contentAlignment = Alignment.Center,
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = item),
                        contentDescription = "アイコン",
                        Modifier
                            .size(93.dp)
                            .padding(start = 6.dp),
                    )
                    Text(text = "test__test", fontSize = 13.sp)
                }
            }
        }
    }

    Canvas(modifier = Modifier.fillMaxWidth()) {
        drawLine(
            color = Color.LightGray,
            start = Offset(0f, 1f),
            end = Offset(size.width, 1f)
        )
    }
}


@Composable
fun InstagramNavigationBar() {
    // ナビゲーションバー部分のUIを実装します。
    BottomNavigation(
        backgroundColor = Color.White
    ) {
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null
            )
        })
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        })
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                imageVector = Icons.Default.AddCircle,
                contentDescription = null
            )
        })
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                imageVector = Icons.Default.DateRange,
                contentDescription = null
            )
        })
        BottomNavigationItem(selected = true, onClick = { /*TODO*/ }, icon = {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                contentDescription = null
            )
        })
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    InstaUIReplicaTheme {
        InstagramHomeScreen()
    }
}