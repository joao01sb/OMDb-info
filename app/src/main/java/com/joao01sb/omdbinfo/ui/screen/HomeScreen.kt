package com.joao01sb.omdbinfo.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joao01sb.omdbinfo.ui.theme.Gray400
import com.joao01sb.omdbinfo.ui.theme.Zinc900

@Preview(showBackground = true)
@Composable
fun HomeScreen(
    onMovieClick: () -> Unit = {}
) {

    Column(
        modifier = Modifier
            .background(Color.Black)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(
                "MovieSearch",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color.White
            )
            Text(
                "Find your favorite movies",
                color = Gray400
            )
        }

        Box(
            modifier = Modifier
                .weight(1f)
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {

            Surface(
                onClick = onMovieClick,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(28.dp),
                color = Zinc900,
                border = BorderStroke(1.dp, Gray400)
            ) {
                Row(
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Search,
                        contentDescription = "Search",
                        tint = Gray400,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = "Search for movies...",
                        color = Gray400,
                        style = MaterialTheme.typography.bodyLarge
                    )
                }
            }

        }


    }

}