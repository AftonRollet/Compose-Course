package com.aftonrollet.quadrants

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aftonrollet.quadrants.ui.theme.ComposeQuadrantTheme

@Composable
fun Quadrant() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}

@Composable
fun ComposeQuadrant() {
    Column(
        modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)) {
            TextCard(
                title = stringResource(R.string.header_one),
                body = stringResource(R.string.text_one),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            TextCard(
                title = stringResource(R.string.header_two),
                body = stringResource(R.string.text_two),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier.weight(1f)
        ) {
            TextCard(
                title = stringResource(R.string.header_three),
                body = stringResource(R.string.text_three),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            TextCard(
                title = stringResource(R.string.header_four),
                body = stringResource(R.string.text_four),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)

            )
        }
    }
}

@Composable
fun TextCard(
    title: String,
    body: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp)
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp),
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}
